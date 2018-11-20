package speedrun.example.com.speedrun.data.datasource.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0010H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u000bH\u00c6\u0003J\t\u0010/\u001a\u00020\rH\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J}\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0001J\u0013\u00102\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u000205H\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016\u00a8\u00067"}, d2 = {"Lspeedrun/example/com/speedrun/data/datasource/dto/SpeedRunGamesDto;", "", "id", "", "names", "Lspeedrun/example/com/speedrun/data/datasource/dto/GameNamesDto;", "abbreviation", "webLink", "released", "releaseDate", "ruleSet", "Lspeedrun/example/com/speedrun/data/datasource/dto/RuleSetDto;", "romHack", "", "created", "assets", "Lspeedrun/example/com/speedrun/data/datasource/dto/AssetsDto;", "links", "", "Lspeedrun/example/com/speedrun/data/datasource/dto/LinksDto;", "(Ljava/lang/String;Lspeedrun/example/com/speedrun/data/datasource/dto/GameNamesDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lspeedrun/example/com/speedrun/data/datasource/dto/RuleSetDto;ZLjava/lang/String;Lspeedrun/example/com/speedrun/data/datasource/dto/AssetsDto;Ljava/util/List;)V", "getAbbreviation", "()Ljava/lang/String;", "getAssets", "()Lspeedrun/example/com/speedrun/data/datasource/dto/AssetsDto;", "getCreated", "getId", "getLinks", "()Ljava/util/List;", "getNames", "()Lspeedrun/example/com/speedrun/data/datasource/dto/GameNamesDto;", "getReleaseDate", "getReleased", "getRomHack", "()Z", "getRuleSet", "()Lspeedrun/example/com/speedrun/data/datasource/dto/RuleSetDto;", "getWebLink", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class SpeedRunGamesDto {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.data.datasource.dto.GameNamesDto names = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String abbreviation = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weblink")
    private final java.lang.String webLink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String released = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "release-date")
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ruleset")
    private final speedrun.example.com.speedrun.data.datasource.dto.RuleSetDto ruleSet = null;
    @com.google.gson.annotations.SerializedName(value = "romhack")
    private final boolean romHack = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created = null;
    @org.jetbrains.annotations.NotNull()
    private final speedrun.example.com.speedrun.data.datasource.dto.AssetsDto assets = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<speedrun.example.com.speedrun.data.datasource.dto.LinksDto> links = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.data.datasource.dto.GameNamesDto getNames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbbreviation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReleased() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.data.datasource.dto.RuleSetDto getRuleSet() {
        return null;
    }
    
    public final boolean getRomHack() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.data.datasource.dto.AssetsDto getAssets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<speedrun.example.com.speedrun.data.datasource.dto.LinksDto> getLinks() {
        return null;
    }
    
    public SpeedRunGamesDto(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.dto.GameNamesDto names, @org.jetbrains.annotations.NotNull()
    java.lang.String abbreviation, @org.jetbrains.annotations.NotNull()
    java.lang.String webLink, @org.jetbrains.annotations.NotNull()
    java.lang.String released, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.dto.RuleSetDto ruleSet, boolean romHack, @org.jetbrains.annotations.NotNull()
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.dto.AssetsDto assets, @org.jetbrains.annotations.NotNull()
    java.util.List<speedrun.example.com.speedrun.data.datasource.dto.LinksDto> links) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.data.datasource.dto.GameNamesDto component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.data.datasource.dto.RuleSetDto component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.data.datasource.dto.AssetsDto component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<speedrun.example.com.speedrun.data.datasource.dto.LinksDto> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.data.datasource.dto.SpeedRunGamesDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.dto.GameNamesDto names, @org.jetbrains.annotations.NotNull()
    java.lang.String abbreviation, @org.jetbrains.annotations.NotNull()
    java.lang.String webLink, @org.jetbrains.annotations.NotNull()
    java.lang.String released, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.dto.RuleSetDto ruleSet, boolean romHack, @org.jetbrains.annotations.NotNull()
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.dto.AssetsDto assets, @org.jetbrains.annotations.NotNull()
    java.util.List<speedrun.example.com.speedrun.data.datasource.dto.LinksDto> links) {
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