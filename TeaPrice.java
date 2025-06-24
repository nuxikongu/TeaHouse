public enum TeaPrice {
    BASIS_PREIS(5),      // Giá cơ bản cho trà
    TOPPING_PREIS(1);    // Giá cho mỗi topping

    private final int preis;  // Lưu giá trị của mỗi loại trà/topping

    // Constructor để khởi tạo giá trị cho mỗi hằng số
    TeaPrice(int preis) {
        this.preis = preis;  // Gán giá trị cho biến preis
    }

    // Phương thức getter để lấy giá trị preis
    public int getPreis() {
        return preis;  // Trả về giá
    }
}
