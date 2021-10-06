@Test
    public void testCloning() throws CloneNotSupportedException {
        HighLowRenderer r1 = new HighLowRenderer();
        r1.setCloseTickPaint(Color.GREEN);
        HighLowRenderer r2 = (HighLowRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    