@Test
    public void testCloning2() throws CloneNotSupportedException {
        XYErrorRenderer r1 = new XYErrorRenderer();
        r1.setErrorStroke(new BasicStroke(1.5f));
        XYErrorRenderer r2 = (XYErrorRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    