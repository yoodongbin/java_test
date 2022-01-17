package chap12;

import chap8.MemberDTO;

//보통 IMemberManagerInterface로 네이밍함
public interface MemberManagerInterface {

    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
