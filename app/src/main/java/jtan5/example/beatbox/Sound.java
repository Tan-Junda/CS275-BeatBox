package jtan5.example.beatbox;

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
