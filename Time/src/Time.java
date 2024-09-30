public class Time {
    public final int hour;
    public final int minute;
    public final int second;

    public Time(int hour) {
        if (!checkHour(hour)) {
            throw new IllegalArgumentException("Invalid hour: " + hour);
        }
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }
    public Time(int hour, int minute) {
        if (!checkHour(hour)) {
            throw new IllegalArgumentException("Invalid hour: " + hour);
        }
        if (!checkMinute(minute)) {
            throw new IllegalArgumentException("Invalid minute: " + minute);
        }
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    public Time(int hour, int minute, int second) {
        if (!checkHour(hour)) {
            throw new IllegalArgumentException("Invalid hour: " + hour);
        }
        if (!checkMinute(minute)) {
            throw new IllegalArgumentException("Invalid minute: " + minute);
        }
        if (!checkSecond(second)) {
            throw new IllegalArgumentException("Invalid second: " + second);
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private boolean checkHour(int hour) {
        if(hour >= 0 && hour < 24) return true;
        return false;
    }

    private boolean checkMinute(int minute) {
        if(minute >= 0 && minute < 60) return true;
        return false;
    }

    private boolean checkSecond(int second) {
        if(second >= 0 && second < 60) return true;
        return false;
    }

    public boolean isPM() {
        int newSecond = (hour * 60 + minute) * 60 + second;

        if (newSecond >= 43200 && newSecond < 86400) return true;
        return false;
    }

    public Time next(int hour) {
        int newHour = this.hour + hour;
        newHour = newHour % 24;
        return new Time(newHour, minute, second);
    }

    public Time next(int hour, int minute) {
        int newHour = this.hour + hour;
        int newMinute = this.minute + minute;

        if (newMinute >= 60) {
            newHour += newMinute / 60;
            newMinute = newMinute % 60;
        }
        newHour = (newHour + (newMinute / 60)) % 24;

        return new Time(newHour, newMinute, second);
    }

    @Override public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}
