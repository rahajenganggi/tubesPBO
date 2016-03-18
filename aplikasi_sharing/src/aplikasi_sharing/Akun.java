package aplikasi_sharing;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kita
 */
public class Akun {
	private String nama;
        private int ukuran;
        private String jenis;
	private int nTeman = 0;
        private int nFollow = 0;
	private int maxTeman;
	private String password;
	private Akun[] friend;
        private ArrayList<Akun> friends = new ArrayList();
	private Teman[] teman;
	private Media[] media;
        private Foto[] foto;
	
	public Akun(String nama, String password){
		this.nama = nama;
		this.password = password;
	}
        
        public Akun(String nama){
                 this.nama = nama;
        }
        
        public void FollowAkun (Akun p ,String nama) {
                tambahFollow(p,nama);
     }
        
        public void tambahFollow (Akun p, String nama) {
                this.nama = nama;
                this.friend[nFollow] = p;
                nFollow++;
        }
        
        public void CreateFoto (Media m){
            m.setNama(nama);
            m.setUkuran(ukuran);
            m.setJenis(jenis);
        }
        

        public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public void addFriend(Akun p){ 
//		if (nTeman < maxTeman) {
//			this.teman[nTeman] = t ;
//			nTeman++;
//		} else {
//			System.out.println("Teman Penuh");
//		}
                friends.add(p);
		
	}
	
	public void removeTeman(Teman t) {
	boolean ketemu = false;
	for (int i=0; i<nTeman; i++) {
		if(teman[i].equals(t)){
			ketemu = true;
			teman[i] = teman[nTeman-1];
			nTeman--;
			break;
		}
		}
	    if (!ketemu) {
		System.out.println("Remove Teman Gagal");
	}
        }
}