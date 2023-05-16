1)	Используйте команды операционной системы Linux и создайте две новых директории – «Игрушки для школьников» и «Игрушки для дошколят»

sql@sql-VirtualBox:~$ mkdir "Игрушки для школьников" "Игрушки для дошколят"
sql@sql-VirtualBox:~$ ls
apache2.conf snap test2.txt untitled_1.odt 'Без имени 4.odt' 'Без имени 7.odt' Загрузки Изображения Общедоступные
end.txt task2.sh test.txt 'Без имени 14.odt' 'Без имени 5.odt' Видео 'Игрушки для дошколят' 'Рабочий стол'
nginx_1.18.0-6ubuntu14.3_amd64.deb test1.txt.bak test.txt.bak 'Без имени 1.odt' 'Без имени 6.odt' Документы 'Игрушки для школьников' Музыка Шаблоны

2) Создайте в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»

sql@sql-VirtualBox:~$ cd "Игрушки для школьников"
sql@sql-VirtualBox:~/Игрушки для школьников$ touch Работа.txt Конструктор.txt "Настольные игры".txt
sql@sql-VirtualBox:~/Игрушки для школьников$ ls
Конструктор.txt 'Настольные игры.txt' Работа.txt

3) Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»

sql@sql-VirtualBox:~/Игрушки для школьников$ cd ..
sql@sql-VirtualBox:~$ cd 'Игрушки для дошколят'
sql@sql-VirtualBox:~/Игрушки для дошколят$ touch "Мягкие игрушки.txt" "Куклы.txt" "Машинки.txt"
sql@sql-VirtualBox:~/Игрушки для дошколят$ ls
Куклы.txt Машинки.txt 'Мягкие игрушки.txt'

4) Объединить 2 директории в одну «Имя Игрушки»

sql@sql-VirtualBox:~$ mv 'Игрушки для дошколят' 'Имя Игрушки' 
sql@sql-VirtualBox:~$ mv 'Игрушки для школьников' 'Имя Игрушки' 
sql@sql-VirtualBox:~$ ls 'Имя Игрушки' 
'Игрушки для дошколят' 'Игрушки для школьников'

5) Переименовать директорию «Имя Игрушки» в «Игрушки»

sql@sql-VirtualBox:~$ mv 'Имя Игрушки' Игрушки
sql@sql-VirtualBox:~$ ls
apache2.conf snap test2.txt untitled_1.odt 'Без имени 4.odt' 'Без имени 7.odt' Загрузки Музыка Шаблоны
end.txt task2.sh test.txt 'Без имени 14.odt' 'Без имени 5.odt' Видео Игрушки Общедоступные
nginx_1.18.0-6ubuntu14.3_amd64.deb test1.txt.bak test.txt.bak 'Без имени 1.odt' 'Без имени 6.odt' Документы Изображения 'Рабочий стол'

6) Просмотреть содержимое каталога «Игрушки».

sql@sql-VirtualBox:~$ tree Игрушки
Игрушки
├── Игрушки для дошколят
│   ├── Куклы.txt
│   ├── Машинки.txt
│   └── Мягкие игрушки.txt
└── Игрушки для школьников
├── Конструктор.txt
├── Настольные игры.txt
└── Работа.txt
2 directories, 6 files

7) Установить и удалить snap-пакет. (Любой, какой хотите)

sql@sql-VirtualBox:~$ snap find opera
Название Версия Издатель Примечание Описание
opera 98.0.4759.15 opera-software✓ - Fast, secure, easy-to-use browser
opera-beta 98.0.4759.21 opera-software✓ - Fast and secure web browser
opera-developer 99.0.4780.0 opera-software✓ - Fast and secure web browser
opera-proxy 1.2.4 snawoot - Standalone Opera VPN proxies client.
operator-builder 0.5.0 vmware-tanzu-labs - A Kubebuilder plugin to accelerate the development of Kubernetes operators.
xdman 8.0.26 capecrusader-121 - Xtreme Download Manager is a powerful tool to increase download speed up-to 500%.
contasimple 3.1.0 enriverd - Contasimple Desktop
office365webdesktop 0.7.2 rafgui012 - It is a simple desktop application for Office365 of the web version for linux
the-battle-for-the-solar-system 1.5.0 marisag1967 - 2D mission-based space shooter
devoperator 1.7.1 art-hens-teeth classic DevOps tools
sql@sql-VirtualBox:~$ sudo snap install opera-beta
opera-beta 98.0.4759.21 от Opera (opera-software✓) установлен
sql@sql-VirtualBox:~$ sudo snap remove opera-beta
opera-beta удалён

8) Добавить произвольную задачу для выполнения каждые 3 минуты (Например, запись в текстовый файл чего-то или копирование из каталога А в каталог Б).

sql@sql-VirtualBox:~$ nano text1.txt
sql@sql-VirtualBox:~$ cat text1.txt
Hello, world!
sql@sql-VirtualBox:~$ ls
apache2.conf text.txt Документы
end.txt untitled_1.odt Загрузки
nginx_1.18.0-6ubuntu14.3_amd64.deb 'Без имени 14.odt' Игрушки
snap 'Без имени 1.odt' Изображения
task2.sh 'Без имени 4.odt' Музыка
test1.txt.bak 'Без имени 5.odt' Общедоступные
test.txt 'Без имени 6.odt' 'Рабочий стол'
test.txt.bak 'Без имени 7.odt' Шаблоны
text1.txt Видео
sql@sql-VirtualBox:~$ nano text2.txt
sql@sql-VirtualBox:~$ ls
apache2.conf text2.txt Видео
end.txt text.txt Документы
nginx_1.18.0-6ubuntu14.3_amd64.deb untitled_1.odt Загрузки
snap 'Без имени 14.odt' Игрушки
task2.sh 'Без имени 1.odt' Изображения
test1.txt.bak 'Без имени 4.odt' Музыка
test.txt 'Без имени 5.odt' Общедоступные
test.txt.bak 'Без имени 6.odt' 'Рабочий стол'
text1.txt 'Без имени 7.odt' Шаблоны
sql@sql-VirtualBox:~$ contab
^[[AКоманда «contab» не найдена. Возможно, вы имели в виду:
command 'crontab' from deb cron (3.0pl1-137ubuntu3)
command 'crontab' from deb bcron (0.11-9)
command 'crontab' from deb systemd-cron (1.15.18-1)
Try: sudo apt install <deb name>
sql@sql-VirtualBox:~$ crontab -e
crontab: installing new crontab
sql@sql-VirtualBox:~$ crontab -l
*/3 * * * * cat /home/sql/text1.txt > /home/sql/text2.txt
sql@sql-VirtualBox:~$ cat text2.txt
Hello, world!
