package dao;

import database.DBConnection;
import model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberDAO {

    Connection con;
    PreparedStatement ps;

    public boolean addMember(Member member) {

        boolean status = false;

        try {

            con = DBConnection.getConnection();

            String sql = "INSERT INTO members(member_name,age,gender,phone,address,username,password,plan_id,trainer_id) VALUES(?,?,?,?,?,?,?,?,?)";

            ps = con.prepareStatement(sql);

            ps.setString(1, member.getMemberName());
            ps.setInt(2, member.getAge());
            ps.setString(3, member.getGender());
            ps.setString(4, member.getPhone());
            ps.setString(5, member.getAddress());
            ps.setString(6, member.getUsername());
            ps.setString(7, member.getPassword());
            ps.setInt(8, member.getPlanId());
            ps.setInt(9, member.getTrainerId());

            int row = ps.executeUpdate();

            if(row>0)
                status = true;

        }
        catch (Exception e){

            e.printStackTrace();

        }

        return status;

    }

}