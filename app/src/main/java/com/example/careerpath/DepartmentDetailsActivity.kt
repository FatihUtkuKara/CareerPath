package com.example.careerpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DepartmentDetailsActivity : AppCompatActivity() {
    private lateinit var departmentName : String
    private lateinit var mainPage : ImageView
    private lateinit var textDetails : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_department_details)
        textDetails = findViewById(R.id.textViewDetails)

        if (intent.hasExtra("departmentName")) {
            departmentName = intent.getStringExtra("departmentName")!!
        }

        if(departmentName.equals("Information Technology")) {

            textDetails.setText("The Information Technology department manages and supports the company's information systems. This department is responsible for the installation, maintenance, and security of computer systems. It handles tasks such as user account management, software updates, and system backups. Additionally, the IT department plays a crucial role in ensuring the proper functioning of data management and network infrastructure. It resolves various software and hardware issues and develops strategies to ensure the company's information security. IT teams keep the company's technology infrastructure up to date by staying abreast of the latest developments in the field of information technology.")
        }

        if(departmentName.equals("Software Development")) {

            textDetails.setText("The Software Development department designs, develops, and implements software solutions to meet user needs. This department manages the entire software lifecycle, which includes requirement analysis, design, coding, testing, and maintenance phases. It also updates and improves existing software based on user feedback. Projects are typically carried out using methodologies such as Agile or Scrum. Software developers use the latest programming languages and technologies to create innovative solutions. They work on custom software projects to enhance the company's competitive edge and ensure operational efficiency.")
        }

        if(departmentName.equals("System and Network Management")) {

            textDetails.setText("The System and Network Management department manages the company's IT infrastructure. This department ensures the continuous operation of networks, servers, and other hardware. System administrators handle the installation, configuration, and maintenance of servers. Network administrators are responsible for network security, traffic management, and troubleshooting. Additionally, the department develops data backup and disaster recovery plans. It monitors the performance of the company's IT infrastructure and performs necessary updates. This ensures that the company's IT resources operate continuously and efficiently.")
        }

        if(departmentName.equals("Data Analytics / Data Science")) {

            textDetails.setText("The Data Analytics and Data Science department analyzes data to provide valuable insights for business strategies. This department conducts data mining, modeling, and statistical analysis. It collects and analyzes data using business intelligence tools and big data technologies. The department applies data visualization techniques to support the company's decision-making processes. It also analyzes customer behaviors and market trends to make strategic recommendations. Data scientists develop machine learning algorithms and offer custom analytical solutions for the company. This enhances the company's competitive advantage and ensures operational efficiency.")
        }

        if(departmentName.equals("Software Testing and Quality Assurance")) {

            textDetails.setText("The Software Testing and Quality Assurance department ensures that software meets quality standards. This department identifies and resolves software defects. Test engineers perform manual and automated tests to check the software's functionality and security. Quality assurance teams monitor the software development processes and ensure compliance with quality standards. They create test plans and test scenarios and report the test results. Additionally, they collaborate with the software development team to develop quality improvement processes. This ensures that the software meets user expectations and adheres to high-quality standards.")
        }

        if(departmentName.equals("IoT")) {

            textDetails.setText("The IoT department develops and implements Internet of Things (IoT) technologies. This department enables devices and systems to connect to the internet. IoT engineers manage and optimize data exchange between sensors and devices. IoT solutions are applied in various fields such as smart homes, industrial automation, and healthcare. The department ensures compliance with security and data privacy standards. It also develops cloud-based solutions for the integration and management of IoT platforms. This enables businesses to operate in a more efficient and connected environment.")
        }

        if(departmentName.equals("Artificial Intelligence")) {

            textDetails.setText("The Artificial Intelligence department develops and implements machine learning and AI technologies. This department offers innovative solutions for automation and data analysis. AI engineers develop algorithms and analyze large data sets. AI applications are used in various sectors such as customer service, finance, and healthcare. The department ensures compliance with ethical and legal standards for AI projects. It also develops AI strategies that provide a competitive edge for businesses. This enhances business efficiency and enables smarter decision-making.")
        }

        if(departmentName.equals("Information Security / Cyber Security")) {

            textDetails.setText("The Information Security and Cyber Security department protects the company's information assets. This department develops defense and security protocols against cyber threats. Information security specialists create strategies for network security, data protection, and defense against cyber attacks. The department identifies security vulnerabilities and takes necessary measures. It also provides cybersecurity awareness training to employees. By continuously updating security policies and procedures, the department ensures the company's security. This protects the integrity and confidentiality of the company's data.")
        }

        if(departmentName.equals("Project Management / Consultancy")) {

            textDetails.setText("The Project Management and Consultancy department ensures the planning, execution, and completion of projects. This department provides consultancy services to improve business processes. Project managers define project goals and coordinate project teams. They create and manage project plans, timelines, and budgets. Consultants offer analyses and strategic recommendations to enhance business efficiency. The department monitors project progress and ensures the successful completion of projects. This contributes to the achievement of business goals and the optimization of business processes.")
        }

        if(departmentName.equals("Customer Support and Services")) {

            textDetails.setText("The Customer Support and Services department provides technical support and services to customers. This department develops solutions to enhance customer satisfaction. Support teams offer 24/7 service to resolve customer complaints and issues. They assist with technical support, product installation, user manuals, and troubleshooting. The department analyzes customer feedback and continuously improves service quality. It also develops innovative solutions to optimize customer service processes. This increases customer satisfaction and loyalty.")
        }

        if(departmentName.equals("Computer Hardware and Infrastructure")) {

            textDetails.setText("The Computer Hardware and Infrastructure department manages the company's physical IT infrastructure. This department handles hardware installations and maintenance. It ensures the smooth operation of network devices, servers, storage systems, and other hardware components. Technical teams diagnose and repair hardware failures. They also perform regular maintenance and upgrades to optimize hardware performance. The department analyzes the company's hardware needs and provides suitable solutions. This ensures operational efficiency and continuous working capacity for the company.")
        }

        if(departmentName.equals("Web and E-commerce")) {

            textDetails.setText("The Web and E-commerce department manages the company's online presence and e-commerce platforms. This department conducts website development and digital marketing strategies. Web developers design and code user-friendly and engaging websites. E-commerce specialists manage and optimize online sales platforms. Digital marketing teams run SEO, social media, and email marketing campaigns. They also use web analytics tools to monitor and analyze visitor behavior. This enhances the company's online visibility and optimizes sales.")
        }

        if(departmentName.equals("Marketing / Sales / CRM")) {

            textDetails.setText("The Marketing, Sales, and CRM department manages customer relationships and implements sales strategies. This department conducts market research and advertising campaigns. Marketing teams develop strategic plans to enhance brand awareness. Sales teams communicate with potential customers and work towards achieving sales targets. CRM specialists analyze customer data and develop personalized marketing strategies. They also create loyalty programs to increase customer satisfaction. This expands the company's customer base and improves sales performance.")
        }

        if(departmentName.equals("Finance")) {

            textDetails.setText("The Finance department manages the company's financial transactions. This department handles budgeting, financial analysis, and reporting. Accounting teams maintain records of income and expenses and prepare financial statements. Financial analysts evaluate the company's financial performance and provide reports for strategic decisions. Budgeting specialists create annual budgets and set financial goals. They also manage cash flow and conduct financial risk analysis. The finance department works to maintain the company's financial health and achieve growth objectives. This ensures the company's sustainability and profitability.")
        }

        if(departmentName.equals("Education / Academia")) {

            textDetails.setText("The Education and Academia department manages training and development programs for employees. This department provides educational materials and courses. Training specialists conduct training needs analysis to enhance employees' competencies. They also develop e-learning platforms and interactive training methods. Academic teams organize professional certification programs and seminars. The department monitors the effectiveness of training programs and conducts continuous improvement efforts.\n" +
                    "\n" +
                    " This department supports the company's talent management strategies and promotes employee career development. This enhances the company's competitiveness and ensures employee satisfaction.\n")
        }

        mainPage = findViewById(R.id.mainPage)
        mainPage.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}