package Entity;

import javax.persistence.*;

@Entity
@Table(name = "sales")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "product_name")
    private String projectName;

    @Column(name = "request_date")
    private String requestDate;

    @Column(name = "status")
    private String status;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public Sales() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sales(String projectName, String requestDate, String status) {
        this.projectName = projectName;
        this.requestDate = requestDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String ex = " Заказ № "+ id +
                ", название продукта: " + projectName +
                ", дата заказа: " + requestDate +
                ", статус: " + status +"\n";
        return ex.replaceAll("^\\[|\\]$", "").replaceAll(",", "");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
