trait BaseSoundPlayer{
    def play
    def close
    def pause
    def stop
    def resume
}

//未实现trait的类抽象方法的，必须定义微抽象的类
abstract class SimpleSoundPlayer extends BaseSoundPlayer{
    def play
    def close{println("SimpleSoundPlayer close")}
}

class Mp3SoundPlayer extends BaseSoundPlayer{
    def play{println("mp3 play")}
    def close{println("mp3 close")}
    def pause{println("mp3 pause")}
    def stop{println("mp3 stop")}
    def resume{println("mp3 resume")}
}

trait BaseSoundFilePlayer
trait BasicController
trait BasicPlayer
trait Mp3BaseSoundFilePlayer extends BaseSoundFilePlayer {
    def getBasicPlayer: BasicPlayer
    def getBasicController: BasicController
    def 
}