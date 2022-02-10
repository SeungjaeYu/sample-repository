package ysjhaha.sample.model;

import lombok.Data;
import ysjhaha.sample.code.RsvnType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_IR_RSVN_DTL")
@SequenceGenerator(name = "Rsvn_Dtl_Seq_Generator", sequenceName = "Rsvn_Dtl_Seq", allocationSize = 1)
@Data
public class RsvnDTL {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "Rsvn_Dtl_Seq_Generator")
    private Long id;

    @Column(name = "RSVN_NO", nullable = false)
    private String rsvnNo;

    @Column(name = "RSVN_SEQ_NO", nullable = false)
    private Integer rsvnSeqNo;

    @Column(name = "ROOM_TYPE_CODE", nullable = false)
    private String roomTypeCode;

    @Column(name = "ARRV_DATE", nullable = false)
    private String arrvDate;

    @Column(name = "DEPT_DATE", nullable = false)
    private String deptDate;

    @Column(name = "RSVN_ROOM_CNT", nullable = false)
    private Integer rsvnRoomCnt;

    @Column(name = "ROOM_FEE", nullable = false)
    private Integer roomFee;

    @Enumerated(EnumType.STRING)
    @Column(name = "RSVN_STATUS_CODE", nullable = false)
    private RsvnType rsvnStatusCode;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FIRST_REG_DT")
    private Date firstRegDt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPD_DT")
    private Date lastUpdDt;
















}
