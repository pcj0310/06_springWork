package com.kh.spring.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.spring.member.model.service.MemberService;
import com.kh.spring.member.model.vo.Member;

@Controller
@RequestMapping("/member")
@SessionAttributes({"loginMember"})
public class MemberController {
	@Autowired			
	private MemberService memberService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	// 보안상 문제로 get방식이랑 post방식으로 구분한다
	
	/*
	@GetMapping("/memberEnroll.me")
	public String memberEnroll() {
		return "member/memberEnroll";
	}
	*/
	// 위에 구문 축약
	@GetMapping("/memberEnroll.me")
	public void memberEnroll() {}	// => /member/memberEnroll
	
	@PostMapping("/memberEnroll.me")
	public String memberEnroll(Member member) {
		System.out.println("userPass = " + member);
		
		// 비밀번호 암호화
		String rawPassword = member.getUserPwd();
		String encodedPassword = passwordEncoder.encode(rawPassword);
		member.setUserPwd(encodedPassword);
		System.out.println("changePass = " + member);
		
		int result = memberService.insertMember(member);
		return "redirect:/";
	}
	@GetMapping("/memberLogin.me")
	public String memberLogin() {
		
		return "member/memberLogin";
	}
	
	
	@PostMapping("/memberLogin.me")
	public String memberLogin(String userId, String userPwd, Model model, RedirectAttributes redirectAtt) {
		System.out.println("userId = " + userId);
		System.out.println("userPwd = " + userPwd);
		
		Member member = memberService.selectOneMember(userId);
		System.out.println("member = " + member);
		
		// 인증
		if(member != null && passwordEncoder.matches(userPwd, member.getUserPwd())) {
			model.addAttribute("loginMember", member);	// requestScope => sessionScope 바꾸기
		} else {
			redirectAtt.addFlashAttribute("msg", "아이디 또는 비밀번호가 맞지 않습니다.");
		}
		return "redirect:/";
	}
	
	// @SessionAttributes + model 통해 로그인정보를 관리하는 경우
	/*
	 * SessionStatus객체를 통해 사용완료 처리해야 한다
	 * 	- session객체를 폐기하지 않고 재사용
	 */
	@GetMapping("/memberLogout.me")
	public String memberLogout(SessionStatus status) {
		if(!status.isComplete())
			status.setComplete();
		
		return "redirect:/";
	}
	
	@GetMapping("/memberDetail.me")
	public String memberDetail() {
		
		return "member/memberDetail";
	}
	
	//void로 생성시 
	/*
	 public void memberDetail() {}가능
	 */
	
	@PostMapping("/memberUpdate.me")
	public String memberUpdate(Member member,Model model,RedirectAttributes redirectAtt) {
		// pw암호화해서 member.userPwd에 넣기
		String rawPassword = member.getUserPwd();
		String encodedPassword = passwordEncoder.encode(rawPassword);
		member.setUserPwd(encodedPassword);
			
		// DB update
		// int형으로 결과 받기
		int result = memberService.updateMember(member);
		// 잘되었다는 alert창
		if(result > 0) {
			redirectAtt.addFlashAttribute("msg", "수정되었습니다");
		} else {
			redirectAtt.addFlashAttribute("msg", "정보 수정 실패");
		}

		model.addAttribute("userId", member.getUserId());
		return "redirect:/member/memberInfo.me?userId="+member.getUserId();
	}	
	
	@GetMapping("/memberInfo.me")
	public String memberInfo(String userId, Model model) {
		model.addAttribute("loginMember", memberService.selectOneMember(userId));
		return "redirct:/";
	}
	
	@GetMapping("/checkId.do")
	public String checkId(@RequestParam String userId, Model model) {
		Member member = memberService.selectOneMember(userId);
		boolean available = member == null;//null이면 true null이 아니면 false
		
		model.addAttribute("userId", userId);
		model.addAttribute("available", available);
		
		return "jsonView";
	}
}