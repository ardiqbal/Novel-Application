package com.example.novelapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class PageAdapter extends FragmentStatePagerAdapter {

    ArrayList<String> pageContents;

    ArrayList<String> pageNumbers;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        pageContents = new ArrayList<>();

        pageContents.add("Perang Diponegoro berawal ketika pihak Belanda memasang patok di tanah milik Diponegoro di desa Tegalrejo. Saat itu, ia memang sudah muak dengan kelakuan Belanda yang tidak menghargai adat istiadat setempat dan sangat mengeksploitasi rakyat dengan pembebanan pajak.");
        pageContents.add("Sikap Diponegoro yang menentang Belanda secara terbuka, mendapat simpati dan dukungan rakyat. Atas saran GPH Mangkubumi, pamannya, Diponegoro menyingkir dari Tegalrejo, dan membuat markas di sebuah gua yang bernama Gua Selarong. Saat itu, Diponegoro menyatakan bahwa perlawanannya adalah perang sabil, perlawanan menghadapi kaum kafir. Semangat \"perang sabil\" yang dikobarkan Diponegoro membawa pengaruh luas hingga ke wilayah Pacitan dan Kedu. Salah seorang tokoh agama di Surakarta, Kyai Maja, ikut bergabung dengan pasukan Diponegoro di Gua Selarong. Kyai Mojo yang lahir di Desa Mojo di wilayah Pajang, dekat Kota Surakarta tertarik berjuang bersama Pangeran Diponegoro karena Pangeran Diponegoro ingin mendirikan kerajaan yang berlandaskan Islam. Kyai Mojo dikenal sebagai ulama besar yang sebenarnya masih memiliki hubungan kekerabatan dengan Diponegoro. Ibu Kyai Mojo, R.A. Mursilah, adalah saudara perempuan dari Sultan Hamengkubuwana III.[2] Akan tetapi, Kyai Mojo yang aslinya bernama Muslim Mochamad Khalifah semenjak lahir tidak mencicipi kemewahan gaya hidup keluarga istana. Jalinan persaudaraan Diponegoro dan Kyai Mojo kian erat setelah Kyai Mojo menikah dengan janda Pangeran Mangkubumi yang merupakan paman dari Diponegoro. Tak heran, Diponegoro memanggil Kyai Mojo dengan sebutan \"paman\" meski relasi keduanya adalah saudara sepupu.[3]");
        pageContents.add("Selain Kyai Mojo, perjuangan Diponegoro juga didukung oleh Sunan Pakubuwono VI dan Raden Tumenggung Prawiradigdaya Bupati Gagatan. Meski demikian, pengaruh dukungan Kyai Mojo terhadap perjuangan Diponegoro begitu kuat karena ia memiliki banyak pengikut dari berbagai lapisan masyarakat. Kyai Mojo yang dikenal sebagai ulama penegak ajaran Islam ini bercita-cita, tanah Jawa dipimpin oleh pemimpin yang mendasarkan hukumnya pada syariat Islam. Semangat memerangi Belanda yang merupakan musuh Islam dijadikan taktik Perang Suci. Oleh sebab itu, kekuatan Dipenogoro kian mendapat dukungan terutama dari tokoh-tokoh agama yang berafiliasi dengan Kyai Mojo.[4] Menurut Peter Carey (2016) dalam Takdir: Riwayat Pangeran Diponegoro 1785-1855 disebutkan bahwa sebanyak 112 kyai, 31 haji, serta 15 syekh dan puluhan penghulu berhasil diajak bergabung.");
        pageContents.add("bla bla bla");
        pageContents.add("akwndkaejnfjksenfkjsenf");

        pageNumbers = new ArrayList<>();
        pageNumbers.add("1");
        pageNumbers.add("2");
        pageNumbers.add("3");
        pageNumbers.add("4");
        pageNumbers.add("5");


    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String selectedContent = pageContents.get(position);
        String selectedPage = pageNumbers.get(position);
        return PageFragment.newInstance(selectedContent, selectedPage);
    }

    @Override
    public int getCount() {
        return pageContents.size();
    }
}
