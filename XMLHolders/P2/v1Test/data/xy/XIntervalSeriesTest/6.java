@Test
    public void testRemove() {
        XIntervalSeries s1 = new XIntervalSeries("Series 1");
        s1.add(1.0, 1.0, 1.0, 2.0);
        s1.add(2.0, 2.0, 2.0, 2.0);
        s1.add(3.0, 3.0, 3.0, 3.0);
        assertEquals(3, s1.getItemCount());

        s1.remove(2.0);
        assertEquals(3.0, s1.getX(1));

        s1.remove(1.0);
        assertEquals(3.0, s1.getX(0));
    }

    