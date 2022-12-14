package Utility;


public class ReportDetailsdesign {
	
	/// to customize the extent html report, this class used 
	

	public static String ReportTableHeader()
	{
	 String tableHeader="<table class=\\\"bordered table-results\\\"><thead><tr><th align='left' width='10%' height='20'><b><font color='ORANGERED' size='2'>CaseNo</font></b></th><th align='left'  width='14%' height='20'><b><font color='TEAL' size='2'>Case</font></b></th><th align='left' width='14%' height='20'><b><font color='ORANGERED' size='2'>Prerequisite</font></b></th><th align='left'  width='10%' height='20'><b><font color='TEAL' size='2'>Steps</font></b></th><th align='left' width='14%' height='20'><b><font color='ORANGERED' size='2' >ExpectedResult</font></b></th><th align='left'  width='14%' height='20'><b><font color='TEAL' size='2'>ActualResult</font></b></th><th align='left'  width='14%' height='20'><b><font color='ORANGERED' size='2'>Comment</font></b></th><th align='left' width='10%' height='20'><b><font color='TEAL' size='2'>Version</font></b></th></tr></thead></table>";
		return tableHeader;
	}
	
	public static String CaseNo()
	{
		String pre="<table class=\"bordered table-results\"><thead><tr><th width='10%' height='20'><font size='2'>";
		return pre;
	}
	
	public static String Case()
	{
		String post="</font></th><th width='14%' height='20'><font size='2'>";
		return post;
	}
	
	public static String Prerequisite()
	{
		String prerequisite="</font></th><th width='14%' height='20'><font size='2'>";
		return prerequisite;
	}
	
	public static String Steps()
	{
		String steps="</font></th><th width='10%' height='20'><font size='2'>";
		return steps;
	}
	
	
	public static String ExpectedResult()
	{
		String exResult="</font></th><th  width='14%' height='20'><font size='2'>";
		return exResult;
	}
	

	public static String ActualResult()
	{
		String actualResult="</font></th><th width='14%' height='20'><font size='2'>";
		return actualResult;
	}
	
	public static String Comment()
	{
		String comment="</font></th><th width='14%' height='20'><font size='2'>";
		return comment;
	}
	
	public static String PreVersion()
	{
		String preVersion="</font></th><th width='10%' height='20' ><font size='2'>";
		return preVersion;
	}
	
	public static String PostVersion()
	{
		String postVersion="</font></tr></thead></table>";
		return postVersion;
	}
	
}
