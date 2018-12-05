package mg.odg.gen.auth.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="`user_roles`")
public class UserRole {

	/*===============START TABLE COLUMNS===================*/
	@Id
	@Column(name = "user_role_id", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
	private int userRoleId;
	
	@Size(max = 255)
    @Column(name = "user_role_name")
    private String userRoleName;

	@Size(max = 255)
    @Column(name = "user_role_description")
    private String userRoleDescription;

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
    
    /*-----------start relations-----------*/
    @OneToOne
    @JoinColumn(name="")
    private UserGroup userGroup;
    
    @OneToMany(mappedBy="userRole")
    private List<UserRole> userRole;
    
    /*-----------end relations-----------*/
    
    /*===============END TABLE COLUMNS===================*/
}
