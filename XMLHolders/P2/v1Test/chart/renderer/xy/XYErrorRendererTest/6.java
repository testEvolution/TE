@Test
    public void testSerialization2() {
        XYErrorRenderer r1 = new XYErrorRenderer();
        r1.setErrorStroke(new BasicStroke(1.5f));
        XYErrorRenderer r2 = (XYErrorRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    