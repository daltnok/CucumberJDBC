Feature: query03
  Background: Connection
    * Database baglantisi kurulur.
    @Query3
    Scenario: Database üzerinden 2023 yili Mayis ayinda olusturulan icerikleri appointment_queue sutununa göre siralayin
      * Query3 olusturulur ve dogrulanir
      * Database baglantisi kapatilir
