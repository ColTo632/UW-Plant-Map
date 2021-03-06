package edu.uw.cs403.plantmap.backend.models;

import lombok.Data;

import java.sql.Blob;
import java.sql.Date;
import com.microsoft.sqlserver.jdbc.Geography;

@Data
public class Submission {

    private int post_id;
    private String posted_by;
    private long post_date;
    private int plant_id;
    private byte[] img;
    private float longitude;
    private float latitude;
    private int reported;

}


