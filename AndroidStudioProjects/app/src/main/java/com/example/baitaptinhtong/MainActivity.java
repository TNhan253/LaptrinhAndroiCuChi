package com.example.baitaptinhtong;

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
        //Hàm này được gọi "đầu tiên" trước khi App hiện ra
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);// Gắn với giao diện
        // Tìm điều khiê để tham chiếu đến và thao tác
        EditText dieukhiena = findViewById(R.id.edita);
         EditText dieukhienb = findViewById(R.id.editb);
        Button nutTinhTong = findViewById(R.id.button);
        //2. Qui định hàm sẽ đuợc gọi khi người dùng nhấn vào nút tính toán
          //2.1 trở ra file xml, tìm thuộc tính Onclick
        //        của nút bấm, đặt cho một tên ( tên hàm)\
        // ví dụ: Onclick: XuLyTinhTong
        //2.2 Ra khỏi hàm OnCreate này để viết hàm XuLyTinhTong
    }// Het ham
    // Ta viết hàm xử lý tính toán ở đây
    public void XuLyTinhTong(View v){
        //1. Tìm điều khiển cần thao tác nếu chưa tìm
        EditText dieukhiena = findViewById(R.id.edita);
        EditText dieukhienb = findViewById(R.id.editb);
        TextView tvKetQua = findViewById(R.id.tvKetQua);
        //2. lấy dữ liệu từ các điều khiển
        String strSoThuNhat= dieukhiena.getText().toString();
        // phải đưa về String, vì getText() cho ta 1 Object
        String strSoThuHai= dieukhienb.getText().toString();
        //3. Đưa về kiểu dữ liệu phù hợp (ở đây là dữ liệu số) để tính toán
        double soa = Double.parseDouble(strSoThuNhat);
        double sob = Double.parseDouble(strSoThuHai);
        //4. Tính toán
        double ketQua = soa + sob;
        //5 Xuất kết quả ra điều khiển tương ứng
        // chuẩn bị: đưa sang dạng chuỗi
        String chuoiThongBao =    String.valueOf(ketQua);
        //để settext
        tvKetQua.setText(chuoiThongBao);
    }
}