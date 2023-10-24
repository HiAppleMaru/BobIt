package me.bobit.myapp.board.service;

public class BoardVO {
	
	//게시글번호
	private int boardNo;
	
	//닉네임
	private String memNick;
	
	//제목
	private String boardSj;
	
	//내용
	private String boardCn;
	
	//공지여부
	private String boardNt;
	
	//생성일
	private java.util.Date boardDate;
	
	//게시판타입(일반게시판 -> a, 신고게시판 -> b)
	private String boardType;
	
	//첨부파일갯수
	private int boardAtch;
	
	//사용여부
	private String boardUse;
	
	//관리자여부
	private String mngAt;
	
	//조회수
	private int boardHit;
		
	public int getBoardHit() {
		return boardHit;
	}

	public void setBoardHit(int boardHit) {
		this.boardHit = boardHit;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardSj() {
		return boardSj;
	}

	public void setBoardSj(String boardSj) {
		this.boardSj = boardSj;
	}

	public String getBoardCn() {
		return boardCn;
	}

	public void setBoardCn(String boardCn) {
		this.boardCn = boardCn;
	}

	public String getBoardNt() {
		return boardNt;
	}

	public void setBoardNt(String boardNt) {
		this.boardNt = boardNt;
	}

	public java.util.Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(java.util.Date boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public int getBoardAtch() {
		return boardAtch;
	}

	public void setBoardAtch(int boardAtch) {
		this.boardAtch = boardAtch;
	}

	public String getBoardUse() {
		return boardUse;
	}

	public void setBoardUse(String boardUse) {
		this.boardUse = boardUse;
	}

	public String getMngAt() {
		return mngAt;
	}

	public void setMngAt(String mngAt) {
		this.mngAt = mngAt;
	}

	public String getMemNick() {
		return memNick;
	}

	public void setMemNick(String memNick) {
		this.memNick = memNick;
	}

}
