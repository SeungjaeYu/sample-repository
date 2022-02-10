package ysjhaha.sample.model;

import lombok.Data;
import ysjhaha.sample.code.RsvnType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_IR_ROOM_RATE")
@SequenceGenerator(name = "Room_Rate_Seq_Generator", sequenceName = "Room_Rate_Seq", allocationSize = 1)
@Data
public class RoomRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "Room_Rate_Seq_Generator")
    @Column(name = "ID")
    private Long id;

    @Column(name = "RSVN_NO", nullable = false)
    private String rsvnNo;

    @Column(name = "RSVN_SEQ_NO", nullable = false)
    private Integer rsvnSeqNo;

    @Column(name = "LODG_DATE", nullable = false)
    private String lodgDate;

    @Column(name = "ROOM_FEE", nullable = false)
    private Integer roomFee;

    @Enumerated(EnumType.STRING)
    @Column(name = "RSVN_STATUS_CODE", nullable = false)
    private RsvnType rsvnStatusCode;

    @Column(name = "ROOM_TYPE_CODE", nullable = false)
    private String roomTypeCode;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FIRST_REG_DT")
    private Date firstRegDt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPD_DT")
    private Date lastUpdDt;
}
