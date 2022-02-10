package ysjhaha.sample;

import ysjhaha.sample.code.RoleType;
import ysjhaha.sample.code.RsvnType;
import ysjhaha.sample.model.Member;
import ysjhaha.sample.model.RoomRate;
import ysjhaha.sample.model.RsvnDTL;
import ysjhaha.sample.model.RsvnMST;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SampleforJPA {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "hello");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();


      // Member findMember = entityManager.find(Member.class, 1L);


        try {
            // RSVN MST
            RsvnMST rsvnMST = new RsvnMST();
            rsvnMST.setRsvnNo("20010001");
            rsvnMST.setInHsGestName("Hong");
            rsvnMST.setArrvDate("20220210");
            rsvnMST.setDeptDate("20220212");
            rsvnMST.setRsvnStatusCode(RsvnType.RR);
            rsvnMST.setFirstRegDt(new Date());
            rsvnMST.setLastUpdDt(new Date());
            entityManager.persist(rsvnMST);

            // RSVN DTL
            RsvnDTL rsvnDTL = new RsvnDTL();
            rsvnDTL.setRsvnNo(rsvnMST.getRsvnNo());
            rsvnDTL.setRsvnSeqNo(1);
            rsvnDTL.setArrvDate(rsvnMST.getArrvDate());
            rsvnDTL.setDeptDate(rsvnMST.getDeptDate());
            rsvnDTL.setRoomTypeCode("STD");
            rsvnDTL.setRsvnStatusCode(rsvnMST.getRsvnStatusCode());
            rsvnDTL.setRsvnRoomCnt(1);
            rsvnDTL.setRoomFee(300000);
            rsvnDTL.setFirstRegDt(new Date());
            rsvnDTL.setLastUpdDt(new Date());
            entityManager.persist(rsvnDTL);

            // ROOM RATE

            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Date startDate = sdf.parse(rsvnDTL.getArrvDate());
            Date endDate = sdf.parse(rsvnDTL.getDeptDate());
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.setTime(startDate);
            cal2.setTime(endDate);
            cal2.add(Calendar.DATE, -1);

            
            while(cal1.compareTo(cal2) <= 0) {
                RoomRate roomRate = new RoomRate();
                roomRate.setRsvnNo(rsvnDTL.getRsvnNo());
                roomRate.setRsvnSeqNo(rsvnDTL.getRsvnSeqNo());
                roomRate.setLodgDate(sdf.format(cal1.getTime()));
                roomRate.setRsvnStatusCode(rsvnMST.getRsvnStatusCode());
                roomRate.setRoomTypeCode(rsvnDTL.getRoomTypeCode());
                roomRate.setRoomFee(rsvnDTL.getRoomFee());
                roomRate.setFirstRegDt(new Date());
                roomRate.setLastUpdDt(new Date());
                cal1.add(Calendar.DATE,1);
                entityManager.persist(roomRate);
            }



            
           




            /*
            Member member = new Member();

            //member.setId(1L);
            member.setAge(100);
            member.setCreateDate(new Date());
            member.setRegisterDate(new Date());
            member.setRoleType(RoleType.ROLE_TYPE);
            member.setDescription("sdfsdfsdfsdfsdfsdfsdfsdfdf");
            member.setUserName("BONG");

            entityManager.persist(member);

            //Thread.sleep(10000);
            */
            /*
            Member member = entityManager.find(Member.class, 1L);

            member.setUserName("Bong1");

            entityManager.flush();

            entityManager.detach(member);

            member.setUserName("Bong11");
            */
            /*
            Member member = new Member();
            member.setUserName("Bong1");
            member.setRegisterDate(LocalDate.now());

            entityManager.persist(member);

            member.setUserName("Bong5");

            entityManager.flush(); // 중요
            
            member.setUserName("Bong7");
            */


            /*
            Member member = new Member();

            member.setUserName("Test1");
            member.setRegisterDate(LocalDate.now());

            entityManager.persist(member);

            Member member1 = entityManager.find(Member.class, 13L);
            Member member2 = entityManager.find(Member.class, 13L);
            */
           // System.out.println("findMember = " + member1.getUserName());//System.out.println("findMember = " + member2.getUserName());
            //member.setRegisterDate(LocalDate.now());
            //member.setUserName("User1111");

            //entityManager.persist(member);
            /*
            Member findMember1 = entityManager.find(Member.class, 9L);

            System.out.println("findMember = " + findMember1.getUserName());

            Member findMember2 = entityManager.find(Member.class, 9L);

            System.out.println("findMember = " + findMember2.getUserName());

            System.out.println("result : " + (findMember1 == findMember2));
            */
            //findMember.setUserName("User222222");

           //entityManager.remove(findMember);
            /*
            Member findMember = entityManager.find(Member.class,1L);
            findMember.setUserName("user2");
            */
            /*
            List<Member> members = entityManager.createQuery("select m from Member as m",Member.class)
                    .setFirstResult(1)
                    .setMaxResults(10)
                    .getResultList();

            for (Member m: members
                 ) {
                System.out.println("m.getName() = " + m.getUserName());
            }

            */
            /*
            Member member = new Member();

            member.setId(2L);
            member.setUserName("user2");
            entityManager.persist(member);
*/

            /*
            Member member = new Member();
            member.setId("2L");
            member.setUserName("dfdf");
            entityManager.persist(member);
            */
          ;
            /*

*/



            entityTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
        } finally {

            entityManager.close();
        }

        entityManagerFactory.close();

    }
}
