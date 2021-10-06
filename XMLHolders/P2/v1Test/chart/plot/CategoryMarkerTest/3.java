@Test
    public void testSerialization() {
        CategoryMarker m1 = new CategoryMarker("A", new GradientPaint(1.0f,
                2.0f, Color.WHITE, 3.0f, 4.0f, Color.YELLOW),
                new BasicStroke(1.1f));
        CategoryMarker m2 = (CategoryMarker) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

    