package daily_Quiz;

public class index {
	
	// 수강정보: 학번, 과목코드, 수강학기(ex. 2016-1), 성적(아직 수강중이면 -1처리, 0이면 재수강)
	  String[][] courseList = {
	            {"202101001", "A0201", "2021-1", "3"},
	            {"202101001", "A0101", "2021-1", "0"},
	            {"202101001", "B0301", "2021-2", "-1"},
	            ///김동직
	            {"202003001", "B0301", "2020-1", "3"},
	            {"202003001", "A0101", "2020-1", "4"},
	            {"202003001", "C0502", "2020-2", "0"},
	            {"202003001", "C0501", "2021-2", "-1"},
	            ///조광호
	            {"201705002 ", "C0501", "2017-1","3"},
			    {"201705002 ", "B0301", "2017-1","4"},
			    {"201705002 ", "A112", "2017-2","1"},
			    {"201705002 ", "C123", "2018-1","2"},
			    {"201705002 ", "C222", "2018-2","1"},
			    {"201705002 ", "C212", "2019-1","3"},
	            ///정유진
			    {"201902002", "B0301", "2019-1", "3"},
				{"201902002", "C0501", "2019-2", "0"},
				{"201902002", "C212", "2020-1", "4"},
				{"201902002", "A210", "2021-1", "3"},
				{"201902002", "A112", "2021-2", "-1"},
				//진미강
				{"201904001", "B0301", "2019-1","3"},
	            {"201904001", "B0302", "2019-1","1"},
	            {"201904001", "C212", "2020-1","2"},
	            {"201904001", "A123", "2021-1","3"},
	            {"201904001", "A112", "2021-2","-1"},
	            //박희대
	            {"201906001", "B0301", "2019-1","2"},
	            {"201906001", "B0302", "2019-1","3"},
	            {"201906001", "C0501", "2019-2","3"},
	            {"201906001", "C0502", "2019-2","1"},
	            {"201906001", "A123", "2020-1","3"},
	            {"201906001", "A210", "2020-2","4"},
	            //박명공
	            {"201701002 ", "B0301", "2017-1","2"},
	            {"201701002 ", "B0302", "2017-2","4"},
	            {"201701002 ", "C0502", "2018-1","2"},
	            {"201701002 ", "A210", "2019-1","0"},
	            {"201701002 ", "A123", "2019-2","2"},
	            {"201701002 ", "C0501", "2020-1","2"},
	            //김영희(졸업)
	            {"202103002", "A112", "2021-2","-1"},
	            //아무개
	            {"202105001", "C0502", "2021-1","3"},
	            {"202105001", "A123", "2021-2","-1"},
	            //홍길동
	            {"202002001", "A123", "2020-1","2"},
	            //이철수
	            {"201804001", "A123", "2018-1","3"},
	            {"201804001", "B120", "2018-1","2"},
	            {"201804001", "C0502", "2019-1","3"},
	            //전우치
	            {"201806002", "C0502", "2018-1","2"},
	            {"201806002", "B0302", "2019-1","3"},
	            {"201806002", "B0301", "2020-1","2"},
	            //김철수
	            {"202101002", "B0301", "2021-1","2"},
	            //이지은
	            {"201703001", "B0301", "2017-1","2"},
	            //차승원
	            {"201805001", "B0301", "2019-1","2"},
	            //박정남
	            {"202102002", "B0301", "2021-1","2"},
	            {"202102002", "B0302", "2021-2","-1"}
	            //김지혜
	  };


}
