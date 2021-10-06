private Object[] createItem(RegularTimePeriod t, int dir, int force) {
        return new Object[] {t.getMiddleMillisecond(), dir, force};
    }
}