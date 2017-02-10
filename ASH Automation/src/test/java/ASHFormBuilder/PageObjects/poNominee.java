package ASHFormBuilder.PageObjects;

/**
 * Created by amey.rajapure on 2/6/2017.
 */
public class poNominee {

    //Sign in Username & Password
    public String txt_UserName = "LoginTextBox";
    public String txt_Password = "PasswordTextBox";
    public String btn_SignIn = "SubmitButton";


    //Master Control - Entire container
    public String conter_MasterControls_ID = "frmb-0-cb-wrap";

    //Master Control - Nominee
    //public String lbl_Nominee = ".//*[@id='frmb-0-control-box']/li[4]/div/div/div";
    public String lbl_Nominee = " .//text()[contains(., 'Nominee')]";

    //Destination for dragging and dropping the Master Control
    public String frm_Destn = "page-1";

    //Search Nominee - Label
    public String lbl_SearchNominee = ".//*[@id='frmb-0-fld-4-0']/label";
    //Search Nominee - Text field
    public String txt_SearchNominee = ".//*[@id='frmb-0-fld-4-0']/div[2]/input";

    //Title - Label
    public String lbl_Title = ".//*[@id='frmb-0-fld-4-3']/label";
    //Title - Dropdown
    public String drpDnList_Title = ".//*[@id='frmb-0-fld-4-3']/div[2]/select";

    //First Name - Label
    public String lbl_FirstName = ".//*[@id='frmb-0-fld-4-4']/label";
    //First Name - Text field
    public String txt_FirstName = ".//*[@id='frmb-0-fld-4-4']/div[2]/input";

    //Last Name - Label
    public String lbl_LastName = ".//*[@id='frmb-0-fld-4-5']/label";
    //Last Name - Text field
    public String txt_LastName = ".//*[@id='frmb-0-fld-4-5']/div[2]/input";

    //Gender - Label
    public String lbl_Gender = ".//*[@id='frmb-0-fld-4-6']/label";
    //Gender - Radio button
    public String rbtn_Gender = ".//*[@id='frmb-0-fld-3-6']/input";

    //Credentials - Label
    public String lbl_Credentials = ".//*[@id='frmb-0-fld-4-7']/label";
    //Credentials - Dropdown
    public String drpDwnList_Credentials = ".//*[@id='frmb-0-fld-4-7']/div[2]/select";

    //Country - Label
    public String lbl_Cntry = ".//*[@id='frmb-0-fld-4-8']/label";
    //Country - Dropdown
    public String drpDwnList_Cntry = ".//*[@id='frmb-0-fld-4-8']/div[2]/select";



}
