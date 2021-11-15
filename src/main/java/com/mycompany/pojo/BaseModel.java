package com.mycompany.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public abstract class BaseModel implements IModel{
	
	public interface Properties extends IModel.Properties
	{
		
	}
	
	public interface Lengths extends IModel.Lengths
	{
		
	}
	
	@Id
	@Getter
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = Properties.ID, unique = true, nullable = false, length = Lengths.ID)
	private String id;
	
    @Setter
    @Getter
    @Version
    private Long version;
    
    @Setter
    @Getter
    @Column(name = "lastModified")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime lastModified;	
}
