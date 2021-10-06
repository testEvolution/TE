@Test
    public void testSerialization() {
        XYBoxAnnotation a1 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0,
                new BasicStroke(1.2f), Color.RED, Color.BLUE);
        XYBoxAnnotation a2 = (XYBoxAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

    