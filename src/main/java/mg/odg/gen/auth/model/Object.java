package mg.odg.gen.auth.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="`objects`")
public class Object {

	@Id
	@Column(name = "object_id", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
	private int objectId;
	
	@Size(max = 255)
    @Column(name = "user_role_name")
    private String objectName;

	@Size(max = 255)
    @Column(name = "user_role_description")
    private String objectDescription;

    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    
    @Column(name = "created_by",  nullable = true)
    private String createdBy;
    
    @Column(name = "updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    
    @Column(name = "updated_by",  nullable = true)
    private String updatedBy;
    
    /*===============END TABLE COLUMNS===================*/
}
