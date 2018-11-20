package speedrun.example.com.speedrun.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u0081\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011\u00a8\u00062"}, d2 = {"Lspeedrun/example/com/speedrun/entity/AssetsEntity;", "Ljava/io/Serializable;", "logo", "Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;", "coverTiny", "coverSmall", "coverMedium", "coverLarge", "icon", "trophyFirst", "trophySecond", "trophyThird", "trophyFourth", "background", "foreground", "(Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;)V", "getBackground", "()Lspeedrun/example/com/speedrun/entity/AssetsInfoEntity;", "getCoverLarge", "getCoverMedium", "getCoverSmall", "getCoverTiny", "getForeground", "getIcon", "getLogo", "getTrophyFirst", "getTrophyFourth", "getTrophySecond", "getTrophyThird", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
public final class AssetsEntity implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity logo = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity coverTiny = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity coverSmall = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity coverMedium = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity coverLarge = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity icon = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity trophyFirst = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity trophySecond = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity trophyThird = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity trophyFourth = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity background = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.entity.AssetsInfoEntity foreground = null;
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getLogo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getCoverTiny() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getCoverSmall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getCoverMedium() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getCoverLarge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getTrophyFirst() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getTrophySecond() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getTrophyThird() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getTrophyFourth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getBackground() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity getForeground() {
        return null;
    }
    
    public AssetsEntity(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity logo, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity coverTiny, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity coverSmall, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity coverMedium, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity coverLarge, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity icon, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity trophyFirst, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity trophySecond, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity trophyThird, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity trophyFourth, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity background, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity foreground) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsInfoEntity component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.entity.AssetsEntity copy(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity logo, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity coverTiny, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity coverSmall, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity coverMedium, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity coverLarge, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity icon, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity trophyFirst, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity trophySecond, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity trophyThird, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity trophyFourth, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity background, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.AssetsInfoEntity foreground) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}