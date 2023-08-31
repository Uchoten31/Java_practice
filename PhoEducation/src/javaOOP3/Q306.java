package javaOOP3;

import java.util.HashSet;

public class Q306 {
	public static void main(String[] args) {
		
        // グループを結成
        HashSet<Member> group = new HashSet<Member>();
        
        // メンバーを追加
        group.add(new Member(1, "山田"));
        group.add(new Member(2, "高田"));
        group.add(new Member(3, "村田"));
        group.add(new Member(4, "吉田"));
        group.add(new Member(5, "川田"));
        
        // 偽物がメンバーとして追加！
        group.add(new Member(1, "ニセ山田"));
        
        // メンバー紹介
        for(Member member : group) {
            System.out.println(member);
        }
    }
}

// メンバークラスは不完全です
class Member {
    private int id;        // ID
    private String name;   // 名前
    
    // コンストラクタ
    public Member(final int id, final String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "ID:" + id + " NAME:" + name;
    }
}
