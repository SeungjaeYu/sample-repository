package ysjhaha.sample.model;

import lombok.Data;
import ysjhaha.sample.code.RsvnType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_IR_RSVN_MST")
@SequenceGenerator(name = "Rsvn_Mst_Seq_Generator", sequenceName = "Rsvn_Mst_Seq", allocationSize = 1)
@Data
public class RsvnMST {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "Rsvn_Mst_Seq_Generator")
    @Column(name = "ID")
    private Long id;

    @Column(name = "RSVN_NO", nullable = false)
    private String rsvnNo;

    @Column(name = "INHS_GEST_NAME", nullable = false)
    private String inHsGestName;

    @Column(name = "ARRV_DATE", nullable = false)
    private String arrvDate;

    @Column(name = "DEPT_DATE")
    private String deptDate;

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
