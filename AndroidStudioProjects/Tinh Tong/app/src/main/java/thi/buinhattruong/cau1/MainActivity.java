package thi.buinhattruong.cau1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Hàm này được gọi ầu tiên trước khi App hiện ra
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Gắn với giao diện

        //Tìm điều khiển để tham chiếu đến và thao tác
        EditText dieuKhienA = findViewById(R.id.edtA);
        //              java <-----------------> xml
        EditText dieuKhienB = findViewById(R.id.edtB);

        Button nutTinhToan = findViewById(R.id.btnTinhTong);

        //----------------------------------------------------------------
        //2. Qui định hầm sẽ được gọi khi ngươ dùng nấn vào nút
            //2.1. trở ra file xml, ti thuộc tnh Onclick
            // của nút bấm, đặt cho một tên (tên hàm)
            // Ví dụ: OnClick: XuLyTinhTong
            //2.2. Ra khỏi hàm OnCreat này để bết hàm XULYTinhTong

    }// Hết hàm OnCreat
    // Ta viết hàm Xử lý Tính Tổngở đây
    public void XuLyTinhTong (View v) {
        //1. Tìm điều khiển cần thao tác nếu chưa tìm
        EditText dieuKhienA = findViewById(R.id.edtA);
        EditText dieuKhienB = findViewById(R.id.edtB);
        TextView tvKetQua = findViewById(R.id.tvTong);
        //2. Lấy dữ liệu
        String strSoThuNhat=dieuKhienA.getText().toString();
        //Phải đưa về String, vì getText() cho ta 1 object
        String strSoThuHai=dieuKhienB.getText().toString();
        //3. Đưa về kiểu dữ liệu phù hợp (ở đây là ữ li số) để tính toán
        double soA = Double.parseDouble(strSoThuNhat);
        double soB = Double.parseDouble(strSoThuHai);
        //4. Tính toán
        double ketQua=soA+soB;

        //Xuất kết quả ra điều khiển tương ứng
            //Chuẩn bị đưa sang dạng chuổi
            String chuoiThongBao=String.valueOf(ketQua);
            //để settext
        tvKetQua.setText(chuoiThongBao);

    }
}