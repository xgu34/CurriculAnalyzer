/**
 * This class represents an actual course.
 * @author Xiangtian Gu
 */
public class Course {
	private String sub;
	private String number;
	private String name;
	private String description;
	private String gradeBasis;
	private String maxCreditHours;
	private String minCreditHours;
	private String maxLectureHours;
	private String minLectureHours;
	private String maxLabHours;
	private String minLabHours;
	private String dept;
	private String sectionsLink;
	private String resctrictions;
	private String prerequisites;
	
    public Course() {
    }

    /**
     * a Constructor which takes username as parameter.
     * @param newUsername a constructor which only takes user name as parameter
     */
    public Course(final String sub, final String number) {
        this.sub = sub;
        this.number = number;
    }
 
    public Course(final String sub, final String number, final String name, final String description, 
    		final String gradeBasis, final String maxCreditHours, final String minCreditHours,
    		final String maxLectureHours, final String minLectureHours, final String maxLabHours,
    		final String minLabHours, final String dept, final String sectionsLink,
    		final String resctrictions, final String prerequisites) {
        this.sub = sub;
        this.number = number;
        this.name = name;
        this.description = description;
        this.gradeBasis = gradeBasis;
        this.maxCreditHours = maxCreditHours;
        this.minCreditHours = minCreditHours;
        this.maxLectureHours = maxLectureHours;
        this.minLectureHours = minLectureHours;
        this.maxLabHours = maxLabHours;
        this.minLabHours = minLabHours;
        this.dept = dept;
        this.sectionsLink = sectionsLink;
        this.resctrictions = resctrictions;
        this.prerequisites = prerequisites;   
    }
    
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGradeBasis() {
		return gradeBasis;
	}
	public void setGradeBasis(String gradeBasis) {
		this.gradeBasis = gradeBasis;
	}
	public String getMaxCreditHours() {
		return maxCreditHours;
	}
	public void setMaxCreditHours(String maxCreditHours) {
		this.maxCreditHours = maxCreditHours;
	}
	public String getMinCreditHours() {
		return minCreditHours;
	}
	public void setMinCreditHours(String minCreditHours) {
		this.minCreditHours = minCreditHours;
	}
	public String getMaxLectureHours() {
		return maxLectureHours;
	}
	public void setMaxLectureHours(String maxLectureHours) {
		this.maxLectureHours = maxLectureHours;
	}
	public String getMinLectureHours() {
		return minLectureHours;
	}
	public void setMinLectureHours(String minLectureHours) {
		this.minLectureHours = minLectureHours;
	}
	public String getMaxLabHours() {
		return maxLabHours;
	}
	public void setMaxLabHours(String maxLabHours) {
		this.maxLabHours = maxLabHours;
	}
	public String getMinLabHours() {
		return minLabHours;
	}
	public void setMinLabHours(String minLabHours) {
		this.minLabHours = minLabHours;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSectionsLink() {
		return sectionsLink;
	}
	public void setSectionsLink(String sectionsLink) {
		this.sectionsLink = sectionsLink;
	}
	public String getResctrictions() {
		return resctrictions;
	}
	public void setResctrictions(String resctrictions) {
		this.resctrictions = resctrictions;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
}
