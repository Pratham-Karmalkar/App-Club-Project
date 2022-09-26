package com.example.mcoe_it;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_about_us);

        NavigationView sideNav;
        DrawerLayout drawerLayout;
        Toolbar toolbar;
        drawerLayout = findViewById(R.id.drawLyt);
        sideNav = findViewById(R.id.sideNav);
        toolbar = findViewById(R.id.toolb);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //Redirecting from sidebar to other activities
        sideNav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                switch (itemId) {
                    case R.id.homeAct:
                        Intent homeActivity = new Intent(AboutUsActivity.this, Home.class);
                        startActivity(homeActivity);
                        finish();
                        break;

                    case R.id.about:
                        Intent about = new Intent(AboutUsActivity.this,AboutUsActivity.class);
                        startActivity(about);
                        finish();
                        break;

                    case R.id.labs:
                        Intent labs = new Intent(AboutUsActivity.this,LabsActivity.class);
                        startActivity(labs);
                        finish();
                        break;

                    case R.id.gall:
                        Intent gallery = new Intent(AboutUsActivity.this,GalleryActivity.class);
                        startActivity(gallery);
                        finish();
                        break;


                    case R.id.clubs:
                        Intent clubs = new Intent(AboutUsActivity.this,ClubsActivity.class);
                        startActivity(clubs);
                        finish();
                        break;


                    case R.id.facultyInfo:
                        /*Intent facInfo = new Intent(MainActivity.this,<facInfo_activity_name>.class);
                          startActivity(facInfo);*/
                        finish();
                        break;


                    case R.id.curriculum:
                        Intent curriculum = new Intent(AboutUsActivity.this,CurriculumActivity.class);
                        startActivity(curriculum);
                        finish();
                        break;

                }

                return false;
            }


        });


        /*//Information text
        TextView info = findViewById(R.id.informa);
        info.setText(Html.fromHtml("The Information Technology department of P.E.S's Modern College of Engineering, Pune started in 2006 with an intake capacity of 60 students. This later increased to 120 from the year 2011-2012.\n"+
                        "\nThe department of Information Technology at P.E.S's Modern College of Engineering is one of the few professionally runs premier Institutes working for the accomplishment of a mission to develop skilled IT professionals, by offering value-based quality education. The Department has made rapid strides as department of excellence for providing modern technical education intensive and meaningful teaching methods as well as regular inputs from practicing corporate. To built-up individual initiative, creativity, talent, leadership and the capability to adopt new Technology the Department encourage the student and staff member to participate and organized the on regular basis seminar, work-shop and many other short-term courses. Our endeavor is to inculcate a desire for continuous improvement, a sense of healthy competition and sensitivity towards ethical and moral values.\n"+
                        "\nThe IT department is dedicated to uphold the following objectives: To develop conceptual and analytical skills in all functional areas of Information Technology, provide platform of high academic excellence to all students, encourage understanding of the strategic perceptions of the fast changing global scenario, develop the ability to understand and apply a multi-dimensional approach to achieve the overall mission of the organization and impart ethical and moral values for social well-being.\n"
                        +"\nDuring previous year, faculty members have presented and published papers at National and International Conferences and in journals.\n"
                        +"\nThe department has seven fully equipped laboratories, with sufficient systems networked via professional servers like Windows 2003 server, backup server, Linux Server and Oracle Server. Multi-lab, Internet facility and high-end multimedia workstations help the students to prepare their projects and presentations. The IT department offers high speed LAN connectivity and 24x7 power back up to ensure uninterrupted working. The student computer ratio of 1:1 in the Institute ensures adequate practical training opportunities for all students.\n"+
                        "\n<span><font color =\"#C00000\" size=\"20\">The Department has following laboratories:</font></span>\\u000D\n"+
                        "\n     \\<></img>Software Lab I \\u000D\\n        \\u2022Programming Lab I\\u000D\\n        \\u2022Operating System Lab\\u000D\\n        \\u2022Hardware Lab\\u000D\\n        \\u2022Software Lab II\\u000D\\n        \\u2022Programming Lab II\\u000D\\n        \\u2022Network Lab\\n       \\n\\nThe department has come up with outstanding academic results. Our student has achieved top rank (2nd) in University and many have got percentiles above 95% in GATE exam. They have scored well in GRE, TOEFL and have taken admissions for post graduate courses in India and abroad.\\n\\n<font color =\"#C00000\" size=\"20\">Vision:</font>\\n u/To develop proficient IT engineers for the Industry and Society.\\u000D\\n\\u000D\\nMission:\\n        To achieve academic excellence.\\u000D\\n        To develop students for being competent in dynamic IT environment.\\u000D\\n        To encourage research and innovation.\\u000D\\n        To inculcate moral and professional ethics.\\n\\nPEO\\u00E2\\u0080\\u0099s:\\n       Demonstrate sustained learning by building the profound foundation of math\\'s, science and engineering  \\n       principles and make the students erudite self reliant and adaptable to diverse culture of \\n       multidisciplinary environment.\\u000D\\n        Prepare graduate with strong knowledge and skills in the field of Information Technology to develop \\n       solutions of complex engineering problems.\\u000D\\n       To bring leadership skill with teamwork in continuous learning environment to bear with professional   \\n       challenges.\\u000D\\n       To inculcate ethics towards issues of professional and social relevance.\\n\\u000D\\nGoals:\\nShort Term Goals:\\n        To enhance teaching learning process with effective utilization of e-resources.\\u000D\\n        To organize national level conference / workshop.\\u000D\\n        Focused Interaction with Alumni.\\n\\nLong Term Goals:\\n        To Improve Industry Collaboration.\\u000D\\n        Promote Faculty for Research.\\u000D\\n        To Introduce Post Graduates Programme and Research Centre.\\u000D\\n        To Enhance Infrastructure and lab development.\\u000D\\n\\nProgramme Outcomes: \\n        Engineering knowledge: Apply the knowledge of mathematics, science, engineering fundamentals, and \\n        an engineering specialization to the solution of complex engineering problems\\u000D\\n        Problem analysis: Identify, formulate, research literature, and analyse complex engineering problems     \\n        reaching substantiated conclusions using first principles of mathematics, natural sciences, and  \\n        engineering sciences.\\u000D\\n        Design/development of solutions: Design solutions for complex engineering problems and design\\n        system components or processes that meet the specified needs with appropriate consideration for the  \\n        public health and safety, and the cultural, societal, and environmental considerations.\\u000D\\n        Conduct investigations of complex problems: Use research-based knowledge and research methods   \\n        including design of experiments, analysis and interpretation of data, and synthesis of the information  \\n        to provide valid conclusions.\\u000D\\n        Modern tool usage: Create, select, and apply appropriate techniques, resources, and modern \\n        engineering and IT tools including prediction and modelling to complex engineering activities with an  \\n        understanding of the limitations.\\u000D\\n        The engineer and society: Apply reasoning informed by the contextual knowledge to assess societal,   \\n        health, safety, legal and cultural issues and the consequent responsibilities relevant to the professional \\n        engineering practice.\\u000D\\n        Environment and sustainability: Understand the impact of the professional engineering solutions in   \\n        societal and environmental contexts, and demonstrate the knowledge of, and need for sustainable   \\n        development.\\u000D\\n        Ethics: Apply ethical principles and commit to professional ethics and responsibilities and norms of the \\n        engineering practice.\\u000D\\n        Individual and team work: Function effectively as an individual, and as a member or leader in diverse    \\n        teams, and in multidisciplinary settings.\\u000D\\n        Communication: Communicate effectively on complex engineering activities with the engineering \\n        community and with society at large, such as, being able to comprehend and write effective reports \\n        and design documentation, make effective presentations, and give and receive clear instructions.\\u000D\\n        Project management and finance: Demonstrate knowledge and understanding of the engineering and \\n        management principles and apply these to one\\u00E2\\u0080\\u0099s own work, as a member and leader in a team, to \\n        manage projects and in multidisciplinary environments.\\u000D\\n        Life-long learning: Recognize the need for, and have the preparation and ability to engage in indepen-\\n        dent and life-long learning in the broadest context of technological change.\\n\\nProgramme Specific Outcomes:\\n        Graduate exhibits skills to analyze, design and develop software\\u000D\\n        Graduate demonstrate technical competency and leadership qualities to work in multidisciplinary \\n        environment.\\n\\n\\n\\n</string>\n" +
                );*/


    }
}