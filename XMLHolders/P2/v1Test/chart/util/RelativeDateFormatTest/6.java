@Test
    public void testCloning() {
        NumberFormat nf = new DecimalFormat("0");
        RelativeDateFormat df1 = new RelativeDateFormat();
        df1.setSecondFormatter(nf);
        RelativeDateFormat df2 = null;
        df2 = (RelativeDateFormat) df1.clone();
        assertTrue(df1 != df2);
        assertTrue(df1.getClass() == df2.getClass());
        assertTrue(df1.equals(df2));

        // is the clone independent
        nf.setMinimumFractionDigits(2);
        assertFalse(df1.equals(df2));
    }

    