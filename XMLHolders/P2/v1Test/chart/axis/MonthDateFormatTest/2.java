@Test
    public void testCloning() {
        MonthDateFormat mf1 = new MonthDateFormat();
        MonthDateFormat mf2 = null;
        mf2 = (MonthDateFormat) mf1.clone();
        assertTrue(mf1 != mf2);
        assertTrue(mf1.getClass() == mf2.getClass());
        assertTrue(mf1.equals(mf2));
    }

    