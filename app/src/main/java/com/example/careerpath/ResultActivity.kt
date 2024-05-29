package com.example.careerpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class ResultActivity : AppCompatActivity() {
    private lateinit var rv: RecyclerView
    private lateinit var adapter: ResultRvAdapter
    private lateinit var mainPage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        rv = findViewById(R.id.rv)
        rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        val maxEigenValueName = intent.getStringExtra("maxEigenVectorName")

        var bilgi_teknolojisi = Departments("Information Technology",4.8,4.8,4.5,3.9,4.0)
        var yazilim_gelistirme = Departments("Software Development", 4.6, 4.4, 4.0, 3.9, 4.0)
        var sistem_ag_yonetimi = Departments("System and Network Management", 3.4, 3.8, 3.5, 3.9, 4.0)
        var veri_analitigi_veri_bilimi = Departments("Data Analytics / Data Science", 4.6, 5.0, 4.0, 3.9, 4.0)
        var yazilim_test_kalite_guvencesi = Departments("Software Testing and Quality Assurance", 4.0, 3.8, 4.0, 3.9, 4.0)
        var iot = Departments("IoT", 3.0, 3.2, 2.5, 3.4, 3.0)
        var yapay_zeka = Departments("Artificial Intelligence", 4.0, 4.0, 3.5, 5.0, 4.0)
        var bilgi_guvenligi_siber_guvenlik = Departments("Information Security / Cyber Security", 3.6, 4.0, 3.5, 4.4, 5.0)
        var proje_yonetimi_danismanlik = Departments("Project Management / Consultancy", 3.6, 3.6, 5.0, 5.0, 3.0)
        var musteri_destek_hizmetleri = Departments("Customer Support and Services", 2.6, 2.6, 3.5, 4.1, 3.0)
        var bilgisayar_donanimi_altyapi = Departments("Computer Hardware and Infrastructure", 2.8, 2.8, 3.0, 3.7, 3.0)
        var web_e_ticaret = Departments("Web and E-commerce", 4.8, 4.4, 4.0, 5.0, 4.0)
        var pazarlama_satis_crm = Departments("Marketing / Sales / CRM", 4.2, 4.6, 4.5, 5.0, 3.0)
        var finans = Departments("Finance", 3.8, 4.8, 4.0, 4.4, 4.0)
        var egitim_akademik = Departments("Education / Academia", 3.0, 3.0, 3.5, 4.6, 3.0)

        mainPage = findViewById(R.id.mainPage)
        mainPage.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

          var resultList: List<Departments> = listOf(
            bilgi_teknolojisi, yazilim_gelistirme, sistem_ag_yonetimi, veri_analitigi_veri_bilimi,
            yazilim_test_kalite_guvencesi, iot, yapay_zeka, bilgi_guvenligi_siber_guvenlik,
            proje_yonetimi_danismanlik, musteri_destek_hizmetleri, bilgisayar_donanimi_altyapi,
            web_e_ticaret, pazarlama_satis_crm, finans, egitim_akademik
        )

        if (maxEigenValueName.equals("eigenVectorV1")) {
            resultList = resultList.sortedByDescending { it.teknolojiProgramlama }
        }
        else if (maxEigenValueName.equals("eigenVectorV2")) {
            resultList = resultList.sortedByDescending { it.veriAnaliziYönetimi }
        }
        else if (maxEigenValueName.equals("eigenVectorV3")) {
            resultList = resultList.sortedByDescending { it.projeYönetimiİşGeliştirme }
        }
        else if (maxEigenValueName.equals("eigenVectorV4")) {
            resultList = resultList.sortedByDescending { it.kişiselProGelişim }
        }
        else if (maxEigenValueName.equals("eigenVectorV5")) {
            resultList = resultList.sortedByDescending { it.bilgiİletişimTeknoloji }
        }


        adapter = ResultRvAdapter(this,resultList)

        rv.adapter = adapter




    }
}