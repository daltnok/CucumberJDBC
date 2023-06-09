package utilities;

public class AllQueries {
    private String query1 = "select live_consult From appointment where patient_id=20";
    private String query2 = "SELECT DISTINCT (a.patient_id) FROM appointment_payment AS ap JOIN appointment AS a ON a.id=ap.appointment_id WHERE ap.payment_type='Offline' ORDER BY a.patient_id ASC";

    public String getQuery3() {
        return query3;
    }

    private String query3 = "SELECT * from appointment_queue WHERE YEAR(created_at) = 2023 AND MONTH(created_at) =5 order by appointment_id asc";
    private String query4 = "select is_active from bed WHERE created_at = '2021-10-25 03:34:25'";

    private String query5 = "select `name` from bed WHERE bed_group_id = 4 and is_active = 'no'";

    private String query6 = "select count(*) as normalbabies from birth_report WHERE weight >= 2.5";

    private String query7 = "SELECT child_name FROM birth_report WHERE patient_id IN (4,14);";
    //private String query7 = "SELECT child_name FROM birth_report WHERE patient_id IN (SELECT patient_id FROM birth_report GROUP BY patient_id HAVING count(*)> 1);";

    private String query8 = "select * FROM blood_donor WHERE id = 7";
    private String query9 = "select DISTINCT(charge_type_id) as charge_type_id from charge_categories WHERE name like 'P%'";

    private String query10 = "select guardian_name from death_report order by death_date desc limit 1";

    public String getQuery11() {
        return query11;
    }

    private String query11 = "SELECT created_at from discharge_card WHERE opd_details_id >11 AND opd_details_id < 31";
    private String query12 = "select (HOUR(end_time - start_time)) as work_hours from doctor_shift WHERE staff_id = 2 and day = 'Tuesday'";

    private String query13 = "select * from medicine_supplier WHERE address = 'Andheri, Mumbai'";
    private String query14 = " select DISTINCT(account_title) from staff WHERE qualification = 'MS' AND specialization='Neurology' ORDER BY account_title ASC";

    public String getQuery15_1() {
        return query15_1;
    }

    public String getQuery15_2() {
        return query15_2;
    }

    private String query15_1 = "select * FROM vehicles order by manufacture_year asc";
    private String query15_2 = "select * from vehicles order by created_at asc";
    public String getQuery14() {
        return query14;
    }

    public String getQuery13() {
        return query13;
    }

    public String getQuery12() {
        return query12;
    }

    public String getQuery10() {
        return query10;
    }

    public String getQuery9() {
        return query9;
    }

    public String getQuery8() {
        return query8;
    }

    public String getQuery7() {
        return query7;
    }

    public String getQuery5() {
        return query5;
    }

    public String getQuery6() {
        return query6;
    }

    public String getQuery1() {
        return query1;
    }

    public String getQuery2() {
        return query2;
    }

    public String getQuery4() {
        return query4;
    }
}
