Feature:

  Scenario Outline: e-bebek Test

    When  Ana sayfa açılır.
    Given Arama çubuğuna <"biberon"> yazılır.Arama yapılır
    And   İlk ürüne tıklanır.
    Then  "Sepete Ekle" butonuna tıklanır
    And   "Sepeti Gör” butonuna tıklanır.
    And   Ürünün sepete eklendiği kontrol edilir.
    Examples:
      |search|
      |biberon|





