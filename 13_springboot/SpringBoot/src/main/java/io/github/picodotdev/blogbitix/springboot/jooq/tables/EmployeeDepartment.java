/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.springboot.jooq.tables;


import io.github.picodotdev.blogbitix.springboot.jooq.Jooq;
import io.github.picodotdev.blogbitix.springboot.jooq.Keys;
import io.github.picodotdev.blogbitix.springboot.jooq.tables.records.EmployeeDepartmentRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeDepartment extends TableImpl<EmployeeDepartmentRecord> {

	private static final long serialVersionUID = 689539525;

	/**
	 * The reference instance of <code>JOOQ.EMPLOYEE_DEPARTMENT</code>
	 */
	public static final EmployeeDepartment EMPLOYEE_DEPARTMENT = new EmployeeDepartment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EmployeeDepartmentRecord> getRecordType() {
		return EmployeeDepartmentRecord.class;
	}

	/**
	 * The column <code>JOOQ.EMPLOYEE_DEPARTMENT.ID</code>.
	 */
	public final TableField<EmployeeDepartmentRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>JOOQ.EMPLOYEE_DEPARTMENT.EMPLOYEE_ID</code>.
	 */
	public final TableField<EmployeeDepartmentRecord, Long> EMPLOYEE_ID = createField("EMPLOYEE_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>JOOQ.EMPLOYEE_DEPARTMENT.DEPARTMENT_ID</code>.
	 */
	public final TableField<EmployeeDepartmentRecord, Long> DEPARTMENT_ID = createField("DEPARTMENT_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>JOOQ.EMPLOYEE_DEPARTMENT</code> table reference
	 */
	public EmployeeDepartment() {
		this("EMPLOYEE_DEPARTMENT", null);
	}

	/**
	 * Create an aliased <code>JOOQ.EMPLOYEE_DEPARTMENT</code> table reference
	 */
	public EmployeeDepartment(String alias) {
		this(alias, EMPLOYEE_DEPARTMENT);
	}

	private EmployeeDepartment(String alias, Table<EmployeeDepartmentRecord> aliased) {
		this(alias, aliased, null);
	}

	private EmployeeDepartment(String alias, Table<EmployeeDepartmentRecord> aliased, Field<?>[] parameters) {
		super(alias, Jooq.JOOQ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<EmployeeDepartmentRecord, Long> getIdentity() {
		return Keys.IDENTITY_EMPLOYEE_DEPARTMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<EmployeeDepartmentRecord> getPrimaryKey() {
		return Keys.PK_EMPLOYEE_DEPARTMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<EmployeeDepartmentRecord>> getKeys() {
		return Arrays.<UniqueKey<EmployeeDepartmentRecord>>asList(Keys.PK_EMPLOYEE_DEPARTMENT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<EmployeeDepartmentRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<EmployeeDepartmentRecord, ?>>asList(Keys.EMPLOYEE_ID, Keys.DEPARTMENT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeDepartment as(String alias) {
		return new EmployeeDepartment(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EmployeeDepartment rename(String name) {
		return new EmployeeDepartment(name, null);
	}
}
