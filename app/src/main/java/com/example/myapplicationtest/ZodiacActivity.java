package com.example.myapplicationtest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ZodiacActivity extends AppCompatActivity {

    TextView textView;
    TextView textViewIntroduce;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiac_view);

        textView=findViewById(R.id.text_zodiac);
        imageView=findViewById(R.id.img_zodiac);
        textViewIntroduce=findViewById(R.id.text_zodiac_introduce);
        //接收数据
        Intent i=getIntent();
        String name = i.getStringExtra("name");
        int year = i.getIntExtra("birthday",1940);


        textView.setText("名字:"+name+" "+"出生年月:"+year+"年");
        //1900年是鼠年
        year-=1900;
        //判断生肖
        switch (year%12){
            case 0:
                imageView.setImageResource(R.drawable.rat);
                textViewIntroduce.setText("         属鼠：被视为机警应变、逆境、子孙繁衍、家业繁荣的象征。有生生不息、繁荣不衰的吉祥寓意。");
                break;
            case 1:
                imageView.setImageResource(R.drawable.cattle);
                textViewIntroduce.setText("         属牛：被视为勤奋朴实、真诚忠诚、忍辱负重、勇武倔强的象征。有勤劳致富、风调雨顺之吉祥的寓意。");
                break;
            case 2:
                imageView.setImageResource(R.drawable.tiger);
                textViewIntroduce.setText("         属虎:被视为威武勇敢、豪爽正义、文彩华丽、气势磅礴的象征。有辟邪降魅、四方安康的吉祥寓意。");
                break;
            case 3:
                imageView.setImageResource(R.drawable.rabbit);
                textViewIntroduce.setText("         属兔：被认为是温柔、安静、纯洁、优雅、机智、敏感、忠诚和善良的象征。有自然超然、永恒的吉祥意义。");
                break;
            case 4:
                imageView.setImageResource(R.drawable.loong);
                textViewIntroduce.setText("         属龙：被视为高贵神圣，志趣高远，能屈能伸，通达旷放的象征。有惩恶镇恶，国泰民安的吉祥寓意。");
                break;
            case 5:
                imageView.setImageResource(R.drawable.snake);
                textViewIntroduce.setText("         属蛇：被认为是美丽多姿、痴情重义、豁达大方、灵活应变的象征。有柔克刚、百折不挠的吉祥寓意。");
                break;
            case 6:
                imageView.setImageResource(R.drawable.horse);
                textViewIntroduce.setText("         属马：被认为是矫健、忠诚、傲慢、勇敢、坚定的象征。有勇往直前的吉祥寓意，人生无尽。");
                break;
            case 7:
                imageView.setImageResource(R.drawable.sheep);
                textViewIntroduce.setText("         属羊：被视为温文善良、善良和谐、顺天随人、纯洁高贵的象征。有丰年富饶、和气生财的吉祥寓意。");
                break;
            case 8:
                imageView.setImageResource(R.drawable.monkey);
                textViewIntroduce.setText("         属猴:被认为是自由、敏捷、聪明、聪明、勇敢、重情好义的象征。有驱魔降妖的吉祥寓意。");
                break;
            case 9:
                imageView.setImageResource(R.drawable.chicken);
                textViewIntroduce.setText("        属鸡：被视为勇武好斗，锐意进取，化解百毒，平安吉祥的象征。有家庭稳定，夫妻和谐的吉祥寓意。");
                break;
            case 10:
                imageView.setImageResource(R.drawable.dog);
                textViewIntroduce.setText("         属狗：被视为机智、真诚、勇敢、尽职守信、舍身重义的象征。四季康泰，和平与和平的吉祥寓意。");
                break;
            case 11:
                imageView.setImageResource(R.drawable.pig);
                textViewIntroduce.setText("         属猪：被视为豪放谦虚、朴实朴实、随遇而安、与世无争的象征。有安居乐业、丰衣足食的吉祥寓意。");
                break;
        }
    }
}
