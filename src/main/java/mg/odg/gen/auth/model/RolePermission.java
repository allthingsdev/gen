package mg.odg.gen.auth.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="`role_permissions`")
public class RolePermission {

	/*===============START TABLE COLUMNS===================*/
	@Id
	@Column(name = "role_permission_id", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
	private int rolePermissionId;
	
	@Size(max = 255)
    @Column(name = "role_permission_name")
    private String rolePermissionName;

	@Size(max = 255)
    @Column(name = "role_permission_description")
    private String rolePermissionDescription;
	
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
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="role_id")
    private UserRole userRole;

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="permission_id")
    private Permission permission;
	
    /*-----------end relations-----------*/
    
    /*===============END TABLE COLUMNS===================*/
}
