package movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class index {
	
	//member: _no, _pw, _name, _gender, _point, _reg_date, _age, _grade
	//cinema: _num, _title, _total_audience, _grade, _startTime, 
      //~ _endTime, _type(��/��/��), _start, _end, _theater(�󿵰�), _country(��/��), _age(���ѿ���), _genre(�帣), _price(����) 
	//ticket: _member_no(����ȸ����ȣ), _buy_type(����Ʈ/����), _date(�����Ͻ�), _cinema_num(���ſ�ȭ�ѹ�)
	//food: _name, _type(����/����/��Ÿ), _price, _date(�Ǹ�����), _member_no(���� ȸ����ȣ)
	//seat: _theater(�󿵰�), _num(�ڸ��ѹ�), _book(���� ����)
	//book: _cinema_num(���� ��ȭ�ѹ�), _seat_num(�ڸ��ѹ�), _member_no(ȸ����ȣ) 
	
	public static void main(String[] args) {
		
		
		String memberList[] = null;
		String cinemaList[] = null;
		String ticketList[] = null;
		String foodList[] = null;
		String seatList[] = null;
		String bookList[] = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		
		
	}
}
