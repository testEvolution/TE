@Test
    public void testNegative() {
        NumberFormat nf = new DecimalFormat("0");
        RelativeDateFormat df1 = new RelativeDateFormat();
        df1.setSecondFormatter(nf);
        assertEquals("-0h0m1s", df1.format(new Date(-1000L)));
    }
}