<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>首页右边</title>
<SCRIPT LANGUAGE="JavaScript" TYPE="text/javascript">
	//创建一个数组,用于存放每个月的天数
	function montharr(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11) {
		this[0] = m0;
		this[1] = m1;
		this[2] = m2;
		this[3] = m3;
		this[4] = m4;
		this[5] = m5;
		this[6] = m6;
		this[7] = m7;
		this[8] = m8;
		this[9] = m9;
		this[10] = m10;
		this[11] = m11;
	}
	//实现月历
	function calendar() {
		var monthNames = "JanFebMarAprMayJunJulAugSepOctNovDec";
		var today = new Date();
		var thisDay;
		var monthDays = new montharr(31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
				30, 31);
		year = today.getYear() + 1900;
		thisDay = today.getDate();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			monthDays[1] = 29;
		nDays = monthDays[today.getMonth()];
		firstDay = today;
		firstDay.setDate(1);
		testMe = firstDay.getDate();
		if (testMe == 2)
			firstDay.setDate(0);
		startDay = firstDay.getDay();
		document.write("<div id='rili'>")
		document
				.write("<TABLE width='217' BORDER='0' CELLSPACING='0' CELLPADDING='2' BGCOLOR='pink' align='right'>")
		document
				.write("<TR><TD><table border='0' cellspacing='1' cellpadding='2' bgcolor='pink'>");
		document.write("<TR><th colspan='7' bgcolor='pink'>");
		var dayNames = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五",
				"星期六");
		var monthNames = new Array("1月", "2月", "3月", "4月", "5月", "6月", "7月",
				"8月", "9月", "10月", "11月", "12月");
		var now = new Date();
		document.writeln("<FONT STYLE='font-size:9pt;Color:#000000'>" + "公元 "
				+ now.getYear() + "年" + monthNames[now.getMonth()] + " "
				+ now.getDate() + "日 " + dayNames[now.getDay()] + "</FONT>");
		document
				.writeln("</TH></TR><TR><TH BGCOLOR='pink'><FONT STYLE='font-size:9pt;Color:White'>日</FONT></TH>");
		document
				.writeln("<th bgcolor='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>一</FONT></TH>");
		document
				.writeln("<TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>二</FONT></TH>");
		document
				.writeln("<TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>三</FONT></TH>");
		document
				.writeln("<TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>四</FONT></TH>");
		document
				.writeln("<TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>五</FONT></TH>");
		document
				.writeln("<TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>六</FONT></TH>");
		document.writeln("</TR><TR>");
		column = 0;
		for (i = 0; i < startDay; i++) {
			document.writeln("\n<TD><FONT STYLE='font-size:9pt'> </FONT></TD>");
			column++;
		}

		for (i = 1; i <= nDays; i++) {
			if (i == thisDay) {
				document
						.writeln("</TD><TD ALIGN='CENTER' BGCOLOR='pink'><FONT STYLE='font-size:9pt;Color:#ffffff'><B>")
			} else {
				document
						.writeln("</TD><TD BGCOLOR='#FFFFFF' ALIGN='CENTER'><FONT STYLE='font-size:9pt;font-family:Arial;font-weight:bold;Color:#330066'>");
			}
			document.writeln(i);
			if (i == thisDay)
				document.writeln("</FONT></TD>")
			column++;
			if (column == 7) {
				document.writeln("<TR>");
				column = 0;
			}
		}
		document
				.writeln("<TR><TD COLSPAN='7' ALIGN='CENTER' VALIGN='TOP' BGCOLOR='pink'>")
		document
				.writeln("<FORM NAME='clock' onSubmit='0'><FONT STYLE='font-size:9pt;Color:#ffffff'>")
		document
				.writeln("现在时间:<INPUT TYPE='Text' NAME='face' ALIGN='TOP'></FONT></FORM></TD></TR></TABLE>")
		document.writeln("</TD></TR></TABLE></div>");
	}
</SCRIPT>
<SCRIPT LANGUAGE="JavaScript" type="text/javascript">
	var timerID = null;
	var timerRunning = false;

	function stopclock() {
		if (timerRunning)
			clearTimeout(timerID);
		timerRunning = false;
	}

	//显示当前时间
	function showtime() {
		var now = new Date();
		var hours = now.getHours();
		var minutes = now.getMinutes();
		var seconds = now.getSeconds()
		var timeValue = " " + ((hours > 12) ? hours - 12 : hours)
		timeValue += ((minutes < 10) ? ":0" : ":") + minutes
		timeValue += ((seconds < 10) ? ":0" : ":") + seconds
		timeValue += (hours >= 12) ? " 下午 " : " 上午 "
		document.clock.face.value = timeValue;
		timerID = setTimeout("showtime()", 1000);//设置超时,使时间动态显示
		timerRunning = true;
	}

	function startclock() {
		stopclock();
		showtime();
	}
</SCRIPT>
</head>
<body>
   我是一张表<script language="JavaScript" type="text/javascript">
		calendar();
	</script>
</body>
</html>