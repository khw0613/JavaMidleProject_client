package kr.or.ddit.ibatis.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.ibatis.vo.hilightVO.Pen_managementVO;

public interface Pen_managementService extends Remote {
	
	public int insert_UsetypePay(Pen_managementVO pen_managementVO) throws RemoteException; // 결제정보 삽입
	
	public int insert_UsetypeRefund(Pen_managementVO pen_managementVO) throws RemoteException; // 결제정보 삽입
	
	public int insert_UsetypeExchange(Pen_managementVO pen_managementVO) throws RemoteException; // 결제정보 삽입
	
	public int insert_UsetypeSupport(Pen_managementVO pen_managementVO) throws RemoteException; // 결제정보 삽입
	
	public List<Pen_managementVO> select_UsePenList() throws RemoteException; // 전체 회원의 형광펜 활용 리스트 출력
	
	public List<Pen_managementVO> select_MemberUsePenList(Pen_managementVO pen_managementVO) throws RemoteException; // 회원별 형광펜 활용 리스트 출력
	
	public List<Pen_managementVO> select_MemberPayPenList(String mem_id) throws RemoteException; // 회원별 형광펜 결제정보 리스트 출력
	
	public List<Pen_managementVO> select_MemberRefundPenList(String mem_id) throws RemoteException; // 회원별 형광펜 환불정보 리스트 출력
	
	public List<Pen_managementVO> select_MemberExchangePenList(String mem_id) throws RemoteException; // 회원별 형광펜 환전정보 리스트 출력
	
	public List<Pen_managementVO> select_MemberSupportPenList(String mem_id) throws RemoteException; // 회원별 형광펜 후원 한 정보 리스트 출력
	
	public List<Pen_managementVO> select_MemberReceivePenList(String mem_id) throws RemoteException; // 회원별 형광펜 후원 받은 정보 리스트 출력
	
	public int insert_UsetypeLunchPayment(Pen_managementVO pen_managementVO) throws RemoteException; // 도시락 결제정보 삽입
	
	public List<Pen_managementVO> select_MemberLunchPaymentPenList(String mem_id) throws RemoteException; // 회원별 도시락 결제한 형광펜 정보 리스트 출력
	
	public List<Pen_managementVO> select_PayPenList() throws RemoteException; // 전체회원의 형광펜 결제(충전)정보 리스트
	
	public List<Pen_managementVO> search_PayPenList(String mem_id) throws RemoteException; // 특정 회원의 형광펜 결제(충전)정보 리스트

	public List<Pen_managementVO> select_ExchangePenList() throws RemoteException; // 전체회원의 형광펜 환전정보 리스트
	
	public List<Pen_managementVO> search_ExchangePenList(String mem_id) throws RemoteException; // 특정 회원의 형광펜 환전정보 리스트

	public List<Pen_managementVO> select_SupportPenList() throws RemoteException; // 전체회원의 형광펜 후원(선물)정보 리스트
	
	public List<Pen_managementVO> search_SupportPenList(String mem_id) throws RemoteException; // 특정 회원의 형광펜 후원(선물) 한 정보 리스트
	
	public List<Pen_managementVO> select_ReceivePenList() throws RemoteException; // 전체 회원의 받은 형광펜 정보리스트

	public List<Pen_managementVO> search_ReceivePenList(String receive_id) throws RemoteException; // 특정 회원의 후원(후원) 받은 정보 리스트
	
	
	public List<Pen_managementVO> select_Profit_Management() throws RemoteException; // 매출관리 정보
	
	public List<Pen_managementVO> select_Profit_BarGrape(String use_date) throws RemoteException; // 매출관리 정보 Bar그래프 출력용 메서드
	
	public List<Map> select_Profit_LineGrape() throws RemoteException; // 매출관리 정보 Line그래프 출력용 메서드(최근 7일의 순이익)
	
}
