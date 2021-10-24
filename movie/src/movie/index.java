package movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class index {
	
	//member: _no, _pw, _name, _gender, _point, _reg_date, _age, _grade
	//cinema: _num, _title, _total_audience, _grade, _startTime, 
      //~ _endTime, _type(조/심/일), _start, _end, _theater(상영관), _country(국/해), _age(제한연령), _genre(장르), _price(가격) 
	//ticket: _member_no(구매회원번호), _buy_type(포인트/현금), _date(구매일시), _cinema_num(구매영화넘버)
	//food: _name, _type(과자/음료/기타), _price, _date(판매일자), _member_no(구매 회원번호)
	//seat: _theater(상영관), _num(자리넘버), _book(예매 여부)
	//book: _cinema_num(예약 영화넘버), _seat_num(자리넘버), _member_no(회원번호) 
	
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
