@Test
    public void testDrawWithNullInfo() {
        BufferedImage image = new BufferedImage(200 , 100,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
                 null);
        g2.dispose();
        //FIXME we should really assert a value here
    }

    