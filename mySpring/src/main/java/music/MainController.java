package music;

import config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
    public static void main(String[] args) {

        /**
         * new music.ClassicMusic()
         *
         */

        AnnotationConfigApplicationContext configApplicationContext =

                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        //ClassicMusic classicMusic = context.getBean("classicMusic", ClassicMusic.class);


        //MusicPlayer musicPlayer = new MusicPlayer(classicMusic);

        //MusicPlayer musicPlayer = configApplicationContext.getBean("musicPlayer", MusicPlayer.class);

        //musicPlayer.play();

        ClassicMusic classicMusic = configApplicationContext.getBean("classicMusic", ClassicMusic.class);

        System.out.println(classicMusic.song());
//
//        musicPlayer.play();
//
//
//
//        System.out.println(musicPlayer.getIsWorking());
//        System.out.println(musicPlayer.getPower());
//        System.out.println(musicPlayer.getVolume());

        configApplicationContext.close();


    }
}
